package com.cooking.first.common.config;

public final class RoleLevel {
	public enum roleLevle {
		GUEST(1), USER(2), ADMIN(3);

		private int level;

		roleLevle(int level) {
			this.level = level;
		}

		public int getLevel() {
			return level;
		}
	}
}
