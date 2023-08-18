import memento.Editor;
import memento.History;
public class Main {
    public static void main(String[] args) {
        mementoImplementation();


    }

    public static void mementoImplementation(){
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        System.out.println(editor.getContent());

        history.push(editor.createState());
        editor.setContent("b");
        System.out.println(editor.getContent());

        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());
        System.out.println(editor.getContent());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}