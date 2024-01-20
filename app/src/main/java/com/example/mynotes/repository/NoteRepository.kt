package com.example.mynotes.repository

import com.example.mynotes.database.NoteDatabase
import com.example.mynotes.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNotes(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNotes(query)
}