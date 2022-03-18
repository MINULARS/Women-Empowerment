package com.mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mini.entity.DocumentSection;
import com.mini.repository.DocumentSectionRepository;

@Service
public class DocumentSectionServiceImpl implements DocumentSectionService {

	@Autowired
	private DocumentSectionRepository documentSectionRepository;

	@Transactional
	public void add(DocumentSection ds) {
		documentSectionRepository.addDocumentSection(ds);
	}

	@Transactional
	public List<DocumentSection> fetchEach() {
		return documentSectionRepository.fetchAll();

	}
}
