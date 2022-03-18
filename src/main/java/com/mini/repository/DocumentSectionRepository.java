package com.mini.repository;

import java.util.List;

import com.mini.entity.DocumentSection;

public interface DocumentSectionRepository {

	public void addDocumentSection(DocumentSection ds);

	public List<DocumentSection> fetchAll();
}
