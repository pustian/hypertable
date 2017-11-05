CREATE NAMESPACE cellcache_delete_issue;
USE cellcache_delete_issue;
DROP TABLE IF EXISTS AUTHSETTINGS;
CREATE TABLE AUTHSETTINGS (
  USERSETTINGS MAX_VERSIONS 10 COUNTER false,
  PASSWORD MAX_VERSIONS 10 COUNTER false,
  ACCESS GROUP AG1 (USERSETTINGS, PASSWORD)
);
INSERT INTO AUTHSETTINGS VALUES ("2015-09-24 21:06:01.000000000","praveen.mishra@shriramcity.com","USERSETTINGS:is-deactivated-user","0"),("2015-09-24 21:06:01.000000000","praveen.mishra@shriramcity.com","PASSWORD","[j{k'642cr?");
COMPACT RANGES ALL;
pause 5;
DELETE * FROM AUTHSETTINGS WHERE ROW="praveen.mishra@shriramcity.com";
SELECT PASSWORD,USERSETTINGS FROM AUTHSETTINGS WHERE  ( CELL = "praveen.mishra@shriramcity.com","USERSETTINGS:is-deactivated-user" OR CELL = "praveen.mishra@shriramcity.com","PASSWORD" )  DISPLAY_TIMESTAMPS MAX_VERSIONS 1 NO_CACHE;