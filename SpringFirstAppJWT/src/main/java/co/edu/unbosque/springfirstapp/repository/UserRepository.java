package co.edu.unbosque.springfirstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.springfirstapp.model.User;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Repositorio para la entidad User.
 * Proporciona operaciones CRUD básicas heredadas de JpaRepository
 * y métodos personalizados para buscar y eliminar usuarios.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Busca un usuario por su nombre de usuario.
	 *
	 * @param username Nombre de usuario a buscar
	 * @return Un Optional que contiene el usuario si existe, o vacío si no existe
	 */
	public Optional<User> findByUsername(String username);

	/**
	 * Elimina un usuario por su nombre de usuario.
	 *
	 * @param username Nombre de usuario del usuario a eliminar
	 */
	public void deleteByUsername(String username);

	/**
	 * Busca un usuario por su edad.
	 *
	 * @param edad Edad del usuario a buscar
	 * @return Un Optional que contiene el usuario si existe, o vacío si no existe
	 */
	public Optional<User> findByEdad(int edad);

	/**
	 * Busca un usuario por su fecha de nacimiento.
	 *
	 * @param fecha Fecha de nacimiento del usuario a buscar
	 * @return Un Optional que contiene el usuario si existe, o vacío si no existe
	 */
	public Optional<User> findByFechaNacimiento(LocalDate fecha);
}