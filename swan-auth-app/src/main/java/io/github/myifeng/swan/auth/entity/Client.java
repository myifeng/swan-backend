package io.github.myifeng.swan.auth.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.util.Strings;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "CLIENT")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {

    @Id
    @GeneratedValue(generator="uuidGenerator")
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    @Column(name="ID", length = 48)
    private String id;

    @Column(name = "NAME", length = 48)
    private String name;

    @Column(name = "CLIENT_ID", length = 48, unique = true)
    private String clientId;

    @Column(name = "CLIENT_SECRET", length = 256)
    private String clientSecret;

    @Builder.Default
    @Column(name = "ACCESS_TOKEN_VALIDITY_SECONDS")
    private Integer accessTokenValiditySeconds = 60 * 60;

    @Builder.Default
    @Column(name = "REFRESH_TOKEN_VALIDITY_SECONDS")
    private Integer refreshTokenValiditySeconds = 3 * 24 * 60 * 60;

    @Column(name = "AUTO_APPROVE", columnDefinition = "bit(1) default 1")
    private boolean autoApprove;

    @Builder.Default
    @Column(name = "SCOPE", length = 200)
    private String scope = "all";

    @Column(name = "REGISTERED_REDIRECT_URI", length = 512)
    private String registeredRedirectUri;

    @Builder.Default
    @Column(name = "AUTHORIZED_GRANT_TYPES", length = 200)
    private String authorizedGrantTypes = "client_credentials,authorization_code,password,refresh_token";

    @Builder.Default
    @Column(name = "CREATE_TIME")
    private Date createTime = new Date();

    @Column(name = "CREATE_ACCOUNT", length = 48)
    private String createAccount;

    public Set<String> getScope() {
        if (StringUtils.isBlank(this.scope)) {
            return Collections.EMPTY_SET;
        }
        return Arrays.stream(Strings.split(this.scope.trim(), ',')).collect(Collectors.toSet());
    }

    public Set<String> getAuthorizedGrantTypes() {
        if (StringUtils.isBlank(this.authorizedGrantTypes)) {
            return Collections.EMPTY_SET;
        }
        return Arrays.stream(Strings.split(this.authorizedGrantTypes.trim(), ',')).collect(Collectors.toSet());
    }

    public Set<String> getRegisteredRedirectUri() {
        if (StringUtils.isBlank(this.registeredRedirectUri)) {
            return Collections.EMPTY_SET;
        }
        return Arrays.stream(Strings.split(this.registeredRedirectUri.trim(), ',')).collect(Collectors.toSet());
    }

}
