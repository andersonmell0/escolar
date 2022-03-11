package br.gov.ba.pm.escolar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.ba.pm.escolar.model.Usuario;
import br.gov.ba.pm.escolar.repository.UsuarioRepository;

@Service
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository user;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = user.findByLogin(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuário Não Encontrado!");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}

}