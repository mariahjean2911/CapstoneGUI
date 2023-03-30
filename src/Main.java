import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Assignment: Punnett Square Solver - Capstone

//Percentages are based off of a chart I found online, the link is:
//https://www.fashionlady.in/all-about-the-human-eye-color-chart/119905
//This article has information about the outcome of the eye color. The article also include infromation on Homozygous,
//Heterozygous factors, dominant eye color, recessive eye color, genotypes and phenotypes. It also includes multiple eye
//color charts for reference and informational chart on rarest eye colors and how they occur.

public class Main extends JFrame implements ActionListener {

    JLabel instructions1 = new JLabel("Please Choose from first drop down menu for first parent's alleles");
    JLabel  instructions2 = new JLabel("Please Choose from second drop down menu for second parent's alleles");
    JLabel key = new JLabel("bb = Blue, GG or Gg = Green, Bb or BB = Brown");

    //creating the arrays to use in the drop down menus
    String[] firstArray = {"Select", "BB", "Bb", "bb", "GG", "Gb"};
    String[] secondArray = {"Select", "GG", "Gb", "BB", "Bb", "bb"};

    //creating a label with the percentages of the offspring's eye color based off of parent's eye color
    JLabel percentages = new JLabel("<html> <br/> Percentages: " + "<br/>" + "<br/>" + "If Both Parents Have " +
            "Brown Eyes, Child has: " + "<br/>" + "75% chance of having Brown eyes" + "<br/>" + "18.75% chance of " +
            "having Green eyes" + "<br/>" + "6.25% chance of having Blue eyes." + "<br/>" + "<br/>" + "If One Parent " +
            "Has Brown Eyes and the" + " Other has Green Eyes, Child has: " + "<br/>" + "50% chance of having Brown " +
            "eyes" + "<br/>" + "37.5% chance of having Green eyes" + "<br/>" + "12.5% chance of having Blue eyes." +
            "<br/>" + "<br/>" + "If one Parent Has Brown eyes and the other has Blue eyes, The Child has: " + "<br/>" +
            "50 % chance of having Brown Eyes" + "<br/>" + "0% chance of having Green Eyes" + "<br/>" +
            "50% chance of having Blue eyes." + "<br/>" + "<br/>" + "If Both Parents have Green Eyes, The Child has: "
            + "<br/>" + "Less than 1% chance of having Brown eyes" + "<br/>" + "75% Chance of Having Green Eyes" + "<br/>" +
            "25% Chance of Having Blue Eyes." + "<br/>" + "<br/>" + "If Both Parents Have Blue Eyes, The Child has: " +
            "<br/>" + "0% Chance of Having Brown Eyes" + "<br/>" + "1% Chance of Having Green Eyes" + "<br/>" +
            "99% Chance of Having Blue Eyes. <html>");

    //creating drop down menus for allele selection using the arrays created above.
    JComboBox<String> allele1 = new JComboBox<>(firstArray);
    JComboBox<String> allele2 = new JComboBox<>(secondArray);
    JButton enter;
    Container punnettSolver;

    Main() {
        punnettSolver = getContentPane();
        punnettSolver.setLayout(new FlowLayout());

        punnettSolver.add(instructions1);
        punnettSolver.add(allele1);

        punnettSolver.add(instructions2);
        punnettSolver.add(allele2);

        punnettSolver.add(key);
        enter = new JButton("Enter");
        enter.addActionListener(this);
        punnettSolver.add(enter);
        punnettSolver.add(percentages);
    }

    public void actionPerformed (ActionEvent e) {
        if(allele1.getSelectedItem() == "Select" && allele2.getSelectedItem() == "Select") {
            JOptionPane.showMessageDialog(null,"Please select an Allele from each drop down menu before proceeding.");
        }
        else if (allele1.getSelectedItem() == "BB" && allele2.getSelectedItem() == "bb")  {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "BB" && allele2.getSelectedItem() == "BB") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "BB" && allele2.getSelectedItem() == "Bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "BB" && allele2.getSelectedItem() == "GG") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "BB" && allele2.getSelectedItem() == "Gb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Bb" && allele2.getSelectedItem() == "GG") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Bb" && allele2.getSelectedItem() == "Gb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Bb" && allele2.getSelectedItem() == "BB") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Bb" && allele2.getSelectedItem() == "Bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Bb" && allele2.getSelectedItem() == "bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "bb" && allele2.getSelectedItem() == "BB") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "bb" && allele2.getSelectedItem() == "Bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "bb" && allele2.getSelectedItem() == "bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Blue Eyes");
        }
        else if (allele1.getSelectedItem() == "bb" && allele2.getSelectedItem() == "GG") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "bb" && allele2.getSelectedItem() == "Gb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "GG" && allele2.getSelectedItem() == "GG") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "GG" && allele2.getSelectedItem() == "Gb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "GG" && allele2.getSelectedItem() == "BB") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "GG" && allele2.getSelectedItem() == "Bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "GG" && allele2.getSelectedItem() == "bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "Gb" && allele2.getSelectedItem() == "BB") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Gb" && allele2.getSelectedItem() == "Bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Brown Eyes");
        }
        else if (allele1.getSelectedItem() == "Gb" && allele2.getSelectedItem() == "bb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "Gb" && allele2.getSelectedItem() == "GG") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
        else if (allele1.getSelectedItem() == "Gb" && allele2.getSelectedItem() == "Gb") {
            JOptionPane.showMessageDialog(null, "The Offspring is Most Likely to Have Green Eyes");
        }
    }
    public static void main(String[] args) {
        Main solver = new Main();
        solver.setTitle("Punnett Square Solver by Mariah McDonough");
        solver.setSize(550, 600);
        solver.setVisible(true);
        solver.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}