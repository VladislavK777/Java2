package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

/**
 * Created by vladislavklockov on 14.07.17.
 */
public class SecurityProxyConnector implements Connector {
    SimpleConnector simpleConnector;
    SecurityChecker securityChecker = new SecurityCheckerImpl();

    public SecurityProxyConnector(String simpleConnector) {
        this.simpleConnector = new SimpleConnector(simpleConnector);
    }

    @Override
    public void connect() {
        if (securityChecker.performSecurityCheck()) {
            simpleConnector.connect();
        }
    }
}
