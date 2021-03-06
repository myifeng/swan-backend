INSERT IGNORE INTO ACCOUNT(ID, USERNAME, MOBILE, PASSWORD) VALUES
  ('A01', 'root', '13000000000', '$2a$10$O7orK7iGLhCpmXtjJsfBWeS2WWrp1SnHCYZ5lY31dW0V/kyvwHsdm','超级管员'),
  ('A02', 'user01', '1', '$2a$10$O7orK7iGLhCpmXtjJsfBWeS2WWrp1SnHCYZ5lY31dW0V/kyvwHsdm','用户01'),
  ('A03', 'user02', '2', '$2a$10$O7orK7iGLhCpmXtjJsfBWeS2WWrp1SnHCYZ5lY31dW0V/kyvwHsdm','用户02');

INSERT IGNORE INTO ROLE(ID, NAME, DESCRIPTION) VALUES
  ('R01', 'ADMIN', '管理员'),
  ('R02', 'TEST_ADMIN', '管理员'),
  ('R10', 'REGULAR', '一般用户');

INSERT IGNORE INTO ACCOUNT_ROLE(ACCOUNT_ID, ROLE_ID) VALUES
  ('A01', 'R01'),
  ('A01', 'R02'),
  ('A02', 'R10'),
  ('A03', 'R10');

INSERT IGNORE INTO AUTHORITY(ID, NAME, DESCRIPTION) VALUES
  ('AU01', 'ADMIN', '系统管理权限'),
  ('AU02', 'TEST02', '测试权限02'),
  ('AU03', 'TEST03', '测试权限03');

INSERT IGNORE INTO ACCOUNT_AUTHORITY(ACCOUNT_ID, AUTHORITY_ID) VALUES
  ('A01', 'AU01'),
  ('A01', 'AU02'),
  ('A02', 'AU02'),
  ('A03', 'AU03');

INSERT IGNORE INTO CLIENT(ID, CLIENT_ID, CLIENT_SECRET, ACCESS_TOKEN_VALIDITY_SECONDS, REFRESH_TOKEN_VALIDITY_SECONDS, SCOPE, AUTHORIZED_GRANT_TYPES) VALUES
  ('C01', 'admin', '$2a$10$O7orK7iGLhCpmXtjJsfBWeS2WWrp1SnHCYZ5lY31dW0V/kyvwHsdm', 3600, 2592000, 'all','client_credentials,authorization_code,password,refresh_token'),
  ('C02', 'swan', '$2a$10$IT/xxGqvDiUEt3GZ.TCEtORVVbmEbhfgDqeXe3trcUBocp5Jl7Qyy', 3600, 864000, 'all','client_credentials,authorization_code,password,refresh_token');