
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class CompilerCore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("codigo.hipotetico"), "UTF8"));
		String str;
		String src = "";
		
		while ((str = in.readLine()) != null) {
            src = src + str + "\n";
        }

		in.close();
		System.out.println(src);
		
		
        ANTLRInputStream input = new ANTLRInputStream(src);


        LLinhaLexer lexer = new LLinhaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        LLinhaParser parser = new LLinhaParser(tokens);
        ParseTree tree = parser.programa(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(50, 30, 300, 50);
        
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setSize(800,600);
        //frame.setPreferredSize(  800, 600  );
        frame.setVisible(true);
        
	}

}
