package com.mohammed.rest.webservice.restfulwebsevices.jwt;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "Mohammed",
        "$2a$10$XCOssR61lYCRfS6NX/nRLu9xMNGrAAELpt0W8dLtnkGi9JUUkSEOC", "ROLE_USER_2"));

      inMemoryUserList.add(new JwtUserDetails(2L, "Amr",
              "$2a$10$nWAeBgkcI2yxpgv/CJQWaOUO4wnTOa2UlVrMk6.XxbrV2wjEtaY2u", "ROLE_USER_2"));

    // $2a$10$hG5tfQCXxL.4vnhUrPKbauxTyQ54F9.ME/G.vZyNfCCIZ8A0F4VMe
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


