# propmigr
A java command line tool to update .properties files when doing upgrades

# usage

     java -jar 'propmigr.jar' /tmp/oldconfig.properties /tmp/newconfig.properties

# before

    /tmp/oldconfig.properties
    allowdomains=mail.mydomain.com

    /tmp/newconfig.properties
    allowdomains=*
    foo=bar


# after
    /tmp/oldconfig.properties
    allowdomains=mail.mydomain.com
    
    /tmp/newconfig.properties
    #Updated by installer via propmigr.
    #Mon Nov 07 09:21:50 CET 2016
    allowdomains=mail.mydomain.com
    foo=bar

