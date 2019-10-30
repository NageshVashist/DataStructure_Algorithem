package com;

import java.util.HashMap;
import java.util.Map;

public enum EmpCode {
	ASSOCIATE(10001), SENIOR_ASSOCIATE(10002), MANAGER(10003), SENIOR_MANAGER(10004);
	private static final Map<Integer, EmpCode> map = new HashMap();
	static {
		for (EmpCode eCode : EmpCode.values()) {
			map.put(eCode.code, eCode);
		}
	}

	private final int code;

	// also implement this method properly
	public static EmpCode getEnum(int code) {

		if (map.get(code) == null) {

			throw new RuntimeException("Employee code " + code + " Not found.");
		}

		return map.get(code);

	}

	private EmpCode(int a) {
		this.code = a;
	}

} // end of public enum EmpCode
