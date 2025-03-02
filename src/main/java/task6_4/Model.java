package task6_4;

import java.util.ArrayList;

public class Model {
    Controller controller;
    NoteBook noteBook = new NoteBook();


    public Model(Controller controller) {
        System.out.println(this);
        this.controller = controller;
    }

    public class Note{
        String title;
        String content;

        public Note(String title, String content) {
            this.title = title;
            this.content = content;
        }
    }

    public class NoteBook{
        ArrayList<Note> notes = new ArrayList<Note>();

        public void addNote(String title, String content){
            Note note = new Note(title, content);
            notes.add(note);
        }

        public Note getNote(String title){
            for(Note note : notes){
                if(note.title.equals(title)){
                    return note;
                }
            }
            return null;
        }
    }
}