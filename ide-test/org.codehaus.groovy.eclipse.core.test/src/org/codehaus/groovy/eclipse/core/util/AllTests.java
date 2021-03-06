package org.codehaus.groovy.eclipse.core.util;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
    public static Test suite() {
        final TestSuite suite = new TestSuite("Test for "
                + AllTests.class.getPackage().getName());
        suite.addTestSuite(TokenStreamTests.class);
        suite.addTestSuite(ExpressionFinderTests.class);
        suite.addTestSuite(ArrayUtilsTests.class);
        return suite;
    }
}
