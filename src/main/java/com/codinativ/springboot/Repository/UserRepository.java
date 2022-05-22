package com.codinativ.springboot.Repository;

import com.codinativ.springboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 22-May-2022 at 17:27
 * @Project StudentCRUD
 * Happy Coding..!
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
