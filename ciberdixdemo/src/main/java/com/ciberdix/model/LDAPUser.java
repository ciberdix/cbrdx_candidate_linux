package com.ciberdix.model;

public class LDAPUser {
    private String ldapUsername;
    private String ldapPassword;
    private boolean isAccepted;
	public String getLdapUsername() {
		return ldapUsername;
	}
	public void setLdapUsername(String ldapUsername) {
		this.ldapUsername = ldapUsername;
	}
	public String getLdapPassword() {
		return ldapPassword;
	}
	public void setLdapPassword(String ldapPassword) {
		this.ldapPassword = ldapPassword;
	}
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
}
