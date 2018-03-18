package org.spring.security.custome.practise.security;

import org.spring.security.custome.practise.entity.Spitter;
import org.spring.security.custome.practise.repository.SpidderUserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SpidderUserService implements UserDetailsService {

    private final SpidderUserRepository userRepository;

    public SpidderUserService(SpidderUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Spitter spitter = userRepository.findByUsername(username);
        if (spitter != null) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_SPITTER"));
            return new User(spitter.getUsername(), spitter.getPassword(), authorities);
        }
        throw new UsernameNotFoundException("User '" + username + "' not found");
    }
}
