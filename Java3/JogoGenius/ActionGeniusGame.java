import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ActionGeniusGame extends JFrame implements GeniusObserver,ActionListener
{ 
	GeniusGame simon;
	JPanel colorButtonsPanel,controlButtonsPanel,scoreBoard;
	JButton quitButton,restartButton;
	JButton redButton,blueButton,greenButton,yellowButton;
	Vector<JButton> colorButtons;
	JLabel labelScore,score;
	Vector<FlashColors> buttonsPressed;
	int countUserInput;
	int seuqneceLength;
	boolean flashButtonInProcess = false;
	
	public ActionGeniusGame(GeniusGame simongame)
	{
		simon = simongame;
		getContentPane().setLayout(new GridLayout(0,1));
		
		colorButtonsPanel = new JPanel();
		controlButtonsPanel = new JPanel();
		scoreBoard = new JPanel();
		getContentPane().add(colorButtonsPanel);
		getContentPane().add(controlButtonsPanel);
		getContentPane().add(scoreBoard);

		colorButtons = new Vector<JButton>();
		buttonsPressed = new Vector<FlashColors>();
		
		redButton = new JButton();
		putBottonOnPanel(redButton,Color.red);
		
		blueButton = new JButton();
		putBottonOnPanel(blueButton,Color.blue);
		
		greenButton = new JButton();
		putBottonOnPanel(greenButton,Color.green);
		
		yellowButton = new JButton();
		putBottonOnPanel(yellowButton,Color.yellow);
		
		for(int i = 0; i < colorButtons.size() ; i++)
			colorButtonsPanel.add(colorButtons.get(i));
		
		quitButton = new JButton("Desistir");
		quitButton.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
            {
            	dispose();
            }
        });
		restartButton = new JButton("Recomeçar");
		restartButton.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
            {
                restart();
            }			
        });
		controlButtonsPanel.add(quitButton);
		controlButtonsPanel.add(restartButton);
		
		labelScore = new JLabel("Pontuação:");
		score = new JLabel("0");
		scoreBoard.add(labelScore);
		scoreBoard.add(score);
		
		setSize(600,600);
		setTitle("Genius");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void putBottonOnPanel(JButton button,Color color) 
	{
		button.setPreferredSize(new Dimension(130, 130));
		button.setBorder(new LineBorder(color,2));
		button.addActionListener(this);
		colorButtons.add(button);
	}
	
	@Override
	public void nextColorSequence(final Vector<FlashColors> sequenceColors) 
	{
		 Thread thread = new Thread("Novo Thread") 
		 {
		      public void run()
		      { 
		    	flashButtonInProcess = true;
		    	displayColorSequence(sequenceColors);
		    	flashButtonInProcess = false;
		      }
		 };  
		 thread.start();
	}
	
	private void displayColorSequence(Vector<FlashColors> sequenceColors) 
	{
		seuqneceLength = sequenceColors.size();
		for(int i = 0 ; i < seuqneceLength ; i++)
		{
			FlashColors flashcolor = sequenceColors.get(i);
			if(flashcolor == FlashColors.Red)
				flashButton(redButton,Color.red);
			else if(flashcolor == FlashColors.Blue)
				flashButton(blueButton,Color.blue);
			else if(flashcolor == FlashColors.Green)
				flashButton(greenButton,Color.green);
			else if(flashcolor == FlashColors.Yellow)
				flashButton(yellowButton,Color.yellow);
			
		}
	}

	private void flashButton(JButton button,Color color) 
	{
		button.setBackground(color);
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		button.setBackground(null);
		try 
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	private void restart()
	{
		buttonsPressed.clear();
		countUserInput = 0;
		simon.restart();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(!flashButtonInProcess)
		{
			JButton button = (JButton) e.getSource();
			
			if(button == redButton)
				buttonsPressed.add(FlashColors.Red);
			else if(button == blueButton)
				buttonsPressed.add(FlashColors.Blue);
			else if(button == greenButton)
				buttonsPressed.add(FlashColors.Green);
			else if(button == yellowButton)
				buttonsPressed.add(FlashColors.Yellow);
			
			countUserInput = countUserInput + 1;
			if(countUserInput == seuqneceLength)
				simon.checkUserInput(buttonsPressed);
		}
	}

	@Override
	public void turnOver()
	{
		buttonsPressed.clear();
		countUserInput = 0;
	}

	@Override
	public void gameOver(boolean isGameOver)
	{
		if(isGameOver)
		{
			JOptionPane.showMessageDialog(this,"Você Perdeu");
			restart();
		}
	}

	@Override
	public void updateScore(int score)
	{
		this.score.setText(Integer.valueOf(score).toString());
	}
}
