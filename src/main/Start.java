package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jogamp.opengl.GLEventListener;

import displays.Lvl;
import displays.LvlOne;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start extends JFrame {

	public JPanel contentPane;
	private Main m;
	private JLabel lblNewLabel;
	private JLabel lblStart;
	private JLabel lblQuit;
	public static Start frame;
	private JLabel lblResume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Start();
					//frame.setUndecorated(true);
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 537);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("NO NAME");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 96));
		lblNewLabel.setBounds(333, 211, 423, 208);
		contentPane.add(lblNewLabel);
		
		lblStart = new JLabel("START");
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.some(frame,contentPane);
				
				
			}
		});
		lblStart.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
		lblStart.setBounds(355, 431, 115, 37);
		contentPane.add(lblStart);
		
		lblQuit = new JLabel("QUIT");
		lblQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblQuit.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
		lblQuit.setBounds(496, 430, 115, 37);
		contentPane.add(lblQuit);
		
		lblResume = new JLabel("RESUME");
		lblResume.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				m.anm.resume();
				disableRes();
				disableQuit();
				Lvl.keyflg=0;
				
			}
		});
		lblResume.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
		lblResume.setBounds(343, 431, 146, 37);
		contentPane.add(lblResume);
		lblResume.disable();
		lblResume.setVisible(false);
	}
	public void disableMy()
	{
		
		 lblNewLabel.disable();
		 lblNewLabel.setVisible(false);
		 lblStart.disable();
		 lblStart.setVisible(false);
		lblQuit.disable();
		lblQuit.setVisible(false);
		
	}
	public void enableMy()
	{
		contentPane.enable();
		contentPane.setVisible(true);
		 lblNewLabel.enable();
		 lblNewLabel.setVisible(true);
		 lblStart.enable();
		 lblStart.setVisible(true);
		lblQuit.enable();
		lblQuit.setVisible(true);
		
	}
	public void enableRes() {
		lblResume.enable();
		lblResume.setVisible(true);
	}
	public void disableRes() {
		lblResume.disable();
		lblResume.setVisible(false);
	}
	public void enableQuit() {
		lblQuit.enable();
		lblQuit.setVisible(true);
	}
	public void disableQuit() {
		lblQuit.disable();
		lblQuit.setVisible(false);
	}
	public void enableCont()
	{
		contentPane.enable();
		contentPane.setVisible(true);
		 
		
	}
	
}
