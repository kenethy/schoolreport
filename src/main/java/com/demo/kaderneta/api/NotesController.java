package com.demo.kaderneta.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kaderneta.model.Notes;
import com.demo.kaderneta.repository.NotesRepository;

@RestController
@RequestMapping("/notes")
public class NotesController {

	@Autowired
	private NotesRepository notesRepository;
	
	@GetMapping
	public List<Notes> listAll(Notes notes) {
		// Example<Student> example = Example.of(student);
		return notesRepository.findAll();
	}
	
	
}
