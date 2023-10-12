package sistemanotas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sistema de Notas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JPanel panel = new JPanel();
            frame.add(panel);

            JButton alunoButton = new JButton("Aluno");
            JButton professorButton = new JButton("Professor");

            panel.add(alunoButton);
            panel.add(professorButton);

            alunoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Caso de Teste 1: Teste de Login do Aluno
                    String username = JOptionPane.showInputDialog("Digite o nome de usuário do aluno:");
                    String password = JOptionPane.showInputDialog("Digite a senha do aluno:");
                    if (loginAluno(username, password)) {
                        consultarNotasAluno();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Falha no login do aluno.");
                    }
                }
            });

            professorButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Caso de Teste 2: Teste de Login do Professor
                    String username = JOptionPane.showInputDialog("Digite o nome de usuário do professor:");
                    String password = JOptionPane.showInputDialog("Digite a senha do professor:");
                    if (loginProfessor(username, password)) {
                        editarNotasProfessor();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Falha no login do professor.");
                    }
                }
            });

            frame.setVisible(true);
        });
    }

    // Função de autenticação do aluno
    private static boolean loginAluno(String username, String password) {
        // Lógica de autenticação do aluno (substitua com sua implementação real)
        return username.equals("usuarioAluno") && password.equals("senhaAluno");
    }

    // Função de consulta de notas do aluno
    private static void consultarNotasAluno() {
        // Caso de Teste 3: Teste de Consulta de Notas
        String disciplina = JOptionPane.showInputDialog("Digite a disciplina:");
        // Lógica para buscar e exibir as notas do aluno para a disciplina selecionada (substitua com sua implementação real).
        JOptionPane.showMessageDialog(null, "Exibindo notas do aluno na disciplina: " + disciplina);
    }

    // Função de autenticação do professor
    private static boolean loginProfessor(String username, String password) {
        // Lógica de autenticação do professor (substitua com sua implementação real)
        return username.equals("usuarioProfessor") && password.equals("senhaProfessor");
    }

    // Função de edição de notas pelo professor
    private static void editarNotasProfessor() {
        // Caso de Teste 4: Teste de Edição de Notas pelo Professor
        String alunoSelecionado = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String disciplina = JOptionPane.showInputDialog("Digite a disciplina:");
        String novaNota = JOptionPane.showInputDialog("Digite a nova nota:");
        // Lógica para editar as notas dos alunos na disciplina selecionada (substitua com sua implementação real).
        JOptionPane.showMessageDialog(null, "Nota do aluno " + alunoSelecionado + " na disciplina " + disciplina + " atualizada para " + novaNota);
    }
}
