package com.qa.notes.junit.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.qa.notes.dto.NoteDto;
import com.qa.notes.persistence.model.Note;
import com.qa.notes.persistence.repository.NoteRepository;
import com.qa.notes.service.NoteService;

@RunWith(MockitoJUnitRunner.class)
public class NoteServiceTest {
	
	@Mock
	private NoteRepository noteRepository;
	
	@InjectMocks
	private NoteService noteService;
	
	@Test
	public void getNotesTest() {
		List<Note> listOfNotes = new ArrayList<Note>();
		listOfNotes.add(new Note(1L, "Text"));
		listOfNotes.add(new Note(5L, "More Text"));
		
		List<NoteDto> listOfNoteDtos = new ArrayList<NoteDto>();
		listOfNoteDtos.add(new NoteDto(1L, "Text"));
		listOfNoteDtos.add(new NoteDto(5L, "More Text"));
		
		Mockito.when(noteRepository.findAll()).thenReturn(listOfNotes);
		assertEquals(listOfNoteDtos.get(1).getId(), noteService.getNotes().get(1).getId());
		assertEquals(listOfNoteDtos.get(1).getText(), noteService.getNotes().get(1).getText());
	}
	

}
