package com.sio.reactspringserver.init;

import com.sio.reactspringserver.builder.StudentBuilder;
import com.sio.reactspringserver.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBRunner implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DBRunner(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        studentRepository.save(new StudentBuilder()
                .setName("Ovi")
                .setAddress("mohakhali")
                .setEmail("sdfd@sdf.com")
                .setPhoneNo("234234234234")
                .getStudentInFormation()
        );
        studentRepository.save(new StudentBuilder()
                .setName("saiful")
                .setAddress("chadpur")
                .setEmail("sdfd@sdf.com")
                .setPhoneNo("234234234234")
                .getStudentInFormation()
        );
    }
}
