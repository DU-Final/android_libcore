/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tests.api.javax.net.ssl;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * This is autogenerated source file. Includes tests for package tests.api.javax.net.ssl;
 */

public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }

    public static Test suite() {
        TestSuite suite = tests.TestSuiteFactory.createTestSuite("All tests for package tests.api.javax.net.ssl;");
        // $JUnit-BEGIN$

        suite.addTestSuite(CertPathTrustManagerParametersTest.class);
        suite.addTestSuite(HandshakeCompletedEventTest.class);
        suite.addTestSuite(HttpsURLConnectionTest.class);
        suite.addTestSuite(KeyManagerFactory1Test.class);
        suite.addTestSuite(KeyManagerFactory2Test.class);
        suite.addTestSuite(KeyManagerFactorySpiTest.class);
        suite.addTestSuite(SSLContext1Test.class);
        suite.addTestSuite(SSLContext2Test.class);
        suite.addTestSuite(SSLContextSpiTest.class);
        suite.addTestSuite(SSLEngineResultTest.class);
        suite.addTestSuite(SSLEngineTest.class);
        suite.addTestSuite(SSLPermissionTest.class);
        suite.addTestSuite(SSLServerSocketFactoryTest.class);
        suite.addTestSuite(SSLSessionBindingEventTest.class);
        suite.addTestSuite(SSLSocketFactoryTest.class);
        suite.addTestSuite(TrustManagerFactory1Test.class);
        suite.addTestSuite(TrustManagerFactory2Test.class);
        suite.addTestSuite(TrustManagerFactorySpiTest.class);
        suite.addTestSuite(X509ExtendedKeyManagerTest.class);
        suite.addTestSuite(SSLSocketTest.class);
        suite.addTestSuite(SSLServerSocketTest.class);
        suite.addTestSuite(SSLProtocolExceptionTest.class);
        suite.addTestSuite(SSLPeerUnverifiedExceptionTest.class);
        suite.addTestSuite(SSLKeyExceptionTest.class);
        suite.addTestSuite(SSLHandshakeExceptionTest.class);
        suite.addTestSuite(SSLExceptionTest.class);
        suite.addTestSuite(SSLEngineResultStatusTest.class);
        suite.addTestSuite(SSLEngineResultHandshakeStatusTest.class);
        suite.addTestSuite(SSLEngineResultTest.class);
        suite.addTestSuite(KeyStoreBuilderParametersTest.class);
        suite.addTestSuite(SSLSessionContextTest.class);
        suite.addTestSuite(X509TrustManagerTest.class);
        suite.addTestSuite(X509KeyManagerTest.class);
        suite.addTestSuite(SSLSessionTest.class);
        suite.addTestSuite(SSLSessionBindingListenerTest.class);
        suite.addTestSuite(HostnameVerifierTest.class);

        // $JUnit-END$
        return suite;
    }
}
