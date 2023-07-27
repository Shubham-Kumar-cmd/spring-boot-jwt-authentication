package com.spring.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
//implements UserDetails
{
	private String userId;
	private String name;
	private String email;
	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return null;
//	}
//	@Override
//	public String getPassword() {
//		return null;
//	}
//	@Override
//	public String getUsername() {
//		return null;
//	}
//	@Override
//	public boolean isAccountNonExpired() {
//		return false;
//	}
//	@Override
//	public boolean isAccountNonLocked() {
//		return false;
//	}
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return false;
//	}
//	@Override
//	public boolean isEnabled() {
//		return false;
//	}
}