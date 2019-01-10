package com.tmobile.ct.codeless.core.datastructure;

/**
 * The Enum SuiteHeaders.
 *
 * @author Rob Graff
 */
public enum SuiteHeaders {

	/** The testname. */
	TESTNAME,

	/** The service. */
	SERVICE,

	/** The method. */
	METHOD,

	/** The operation. */
	OPERATION,

	/** The bodytemplate. */
	BODYTEMPLATE,

	/** The expectedstatus. */
	EXPECTEDSTATUS,

	/** The input operation. */
	INPUT,

	/** The target operation. */
	TARGET,

	/** The testdata. */
	TESTDATA;

	/**
	 * Instantiates a new suite headers.
	 */
	private SuiteHeaders() {

	}

	/**
	 * Parses the.
	 *
	 * @param header the header
	 * @return the suite headers
	 */
	public static SuiteHeaders parse(String header) {
		for (SuiteHeaders e : SuiteHeaders.values()) {
			if (e.name().equalsIgnoreCase(header)) {
				return e;
			}
		}
		return SuiteHeaders.TESTDATA;
	}
}
