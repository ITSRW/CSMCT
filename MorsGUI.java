package CYCLESECURITYSYSTEM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JCheckBox;

import java.awt.Toolkit;

public class MorsGUI extends JFrame {
	private static final long serialVersionUID = -2299936641204274025L;
	private JPanel contentPane;
	final ChineseFuncBox cfb=new ChineseFuncBox();
	public static void main(String[] args) {
		if(UIManager.getLookAndFeel().isSupportedLookAndFeel()){
			final String platform = UIManager.getSystemLookAndFeelClassName();
			// If the current Look & Feel does not match the platform Look & Feel,
			// change it so it does.
			if (!UIManager.getLookAndFeel().getName().equals(platform)) {
				try {
					UIManager.setLookAndFeel(platform);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MorsGUI frame = new MorsGUI();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MorsGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\总站\\电子实验基站\\设计\\计算机科学研究项目\\工作空间集\\EclipseDesigner\\信息循环交错加密解码安全模组系统\\icon.jpg"));
		setType(Type.POPUP);
		setFont(new Font("Dialog", Font.BOLD, 17));
		setTitle("信息循环交错加密解码安全模组系统8.0");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 590);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(Color.DARK_GRAY);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("帮助");
		JMenuItem Induction = new JMenuItem("说明");
		JMenuItem Version = new JMenuItem("版本");
		menu.add(Induction);
		menu.add(Version);
		bar.add(menu);
		this.setJMenuBar(bar);
		Induction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
						"1.请在输入框中输入需加密/解密的文段或直接点击“打开”选择文件（txt、DOC等文本）。\n"
								+ "2.可以在高级设置中设定交错转码加密关键码数（默认值为0），不勾选则默认转译为普通莫尔斯电码。\n"
								+ "3.点击“转码预览”或“逆转码预览”进行预览高级加密效果，加密”或“解密”完成转译。\n"
								+ "4.如需保存结果请点击“导出结果至”进行保存，如需保存关键码请点击“保存关键码至”进行保存关键码。\n"
								+ "5.清空编辑框请点击“清空”按钮。\n"
								+ "6.通过高级选项交错转码加密的莫尔斯文段需设定正确的关键码方可以解密。\n"
								+ "注意：为保护加密文件的数据完整性，本软件禁止多段非同一文件加密内容同时解密，同时解密可能导致数据解码失败！", 
								"使用说明",JOptionPane.WARNING_MESSAGE); 
			}
		});

		Version.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
						"MORSE 高阶加密解密器 6.8版！\n"
								+ "开发者：桂林电子科技大学 计算机与信息安全学院 庭燎阁·林以文·杨博文\n"
								+ "版本发布时间：2017年3月25日"
								+ "", "版本及作者",JOptionPane.WARNING_MESSAGE);  
			}
		});
		JScrollPane inputscrollpane = new JScrollPane();
		inputscrollpane.setOpaque(false);
		inputscrollpane.getViewport().setOpaque(false);
		inputscrollpane.setBounds(10, 38, 717, 116);
		contentPane.add(inputscrollpane);

		final JTextArea inputArea = new JTextArea();
		inputArea.setForeground(new Color(0, 0, 255));
		inputArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		inputscrollpane.setViewportView(inputArea);
		inputArea.setBackground(Color.DARK_GRAY);
		inputArea.setLineWrap(true);
		inputArea.setOpaque(false);
		
		JScrollPane previewscrollpane = new JScrollPane();
		previewscrollpane.setOpaque(false);
		previewscrollpane.getViewport().setOpaque(false);
		previewscrollpane.setBounds(10, 290, 830, 97);
		contentPane.add( previewscrollpane);

		final JTextArea previewArea = new JTextArea();
		previewArea.setForeground(new Color(255, 215, 0));
		previewArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		previewscrollpane.setViewportView(previewArea);
		previewArea.setBackground(Color.DARK_GRAY);
		previewArea.setLineWrap(true);
		previewArea.setOpaque(false);

		JScrollPane outputscrollPane = new JScrollPane();
		outputscrollPane.setOpaque(false);
		outputscrollPane.getViewport().setOpaque(false);
		outputscrollPane.setBounds(10, 425, 830, 97);
		contentPane.add(outputscrollPane);

		final JTextArea outputArea= new JTextArea();
		outputArea.setWrapStyleWord(true);
		outputArea.setForeground(new Color(255, 0, 0));
		outputArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		outputscrollPane.setViewportView(outputArea);
		outputArea.setBackground(Color.DARK_GRAY);
		outputArea.setLineWrap(true);
		outputArea.setOpaque(false);

		final JTextArea key = new JTextArea();
		key.setText("0");
		key.setLineWrap(true);
		key.setFont(new Font("Monospaced", Font.PLAIN, 15));
		key.setBackground(Color.LIGHT_GRAY);
		key.setForeground(new Color(255, 0, 0));
		key.setBounds(192, 222, 109, 24);
		contentPane.add(key);
		key.setOpaque(false);
		key.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

		final JTextArea remaindArea = new JTextArea();
		remaindArea.setWrapStyleWord(true);
		remaindArea.setText("\u5F85\u547D...");
		remaindArea.setEditable(false);
		remaindArea.setForeground(new Color(255, 215, 0));
		remaindArea.setLineWrap(true);
		remaindArea.setFont(new Font("黑体", Font.BOLD, 18));
		remaindArea.setBackground(new Color(0, 0, 0));
		remaindArea.setBounds(366, 173, 361, 73);
		contentPane.add(remaindArea);
		remaindArea.setOpaque(false);
		remaindArea.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		
		final JCheckBox Advantageoption = new JCheckBox("交错式转码加解密");
		Advantageoption.setFont(new Font("黑体", Font.BOLD, 15));
		Advantageoption.setForeground(new Color(255, 0, 0));
		Advantageoption.setBackground(Color.DARK_GRAY);
		Advantageoption.setBounds(98, 189, 162, 23);
		contentPane.add(Advantageoption);
		Advantageoption.setOpaque(false);
		Advantageoption.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		
		//预览按钮
		JButton btnNewButton = new JButton("转码预览");
		btnNewButton.addActionListener(new ActionListener() {
			preTranslate Translate=new preTranslate();
			public void actionPerformed(ActionEvent arg0) {
				remaindArea.setText("");
				if(inputArea.getText().equals("")){
					remaindArea.setText("未输入代转文段！");
					return;
				}
				previewArea.setText("");
				String preview=inputArea.getText();
				
				//中文模块
				preview=cfb.gbEncoding(preview);
				
				if(Advantageoption.isSelected()==false){
					remaindArea.setText("未启用高级选项！");
					return;
				}
				else if(Advantageoption.isSelected()==true){
					if(key.getText().equals("")){
						remaindArea.setText("未设定关键码！");
						return;
					}
					for(int charillegal=0;charillegal<key.getText().length();charillegal++){
						if(key.getText().charAt(charillegal)>57||key.getText().charAt(charillegal)<48){
							remaindArea.setText("请输入正确的关键码！");
							return;
						}
					}
					if(Integer.parseInt(key.getText())<0){
						remaindArea.setText("请输入正确的关键码！");
						return;
					}
					Translate.build();
					preview=Translate.pretranslate(preview,Integer.parseInt((key.getText())));
					previewArea.setText(preview);
				}
			}
		});
		btnNewButton.setBounds(231, 260, 112, 24);
		contentPane.add(btnNewButton);

		//逆转译按钮
		JButton button_1 = new JButton("逆转码预览");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				remaindArea.setText("");
				Morstoenglish text=new Morstoenglish(); 
				if(inputArea.getText().equals("")){
					remaindArea.setText("未输入代转文段！");
					return;
				}
				previewArea.setText("");
				String preview=inputArea.getText();
				if(Advantageoption.isSelected()==false){
					remaindArea.setText("未启用高级选项！");
					return;
				}
				else if(Advantageoption.isSelected()==true){
					if(key.getText().equals("")){
						remaindArea.setText("未设定关键码！");
						return;
					}
					for(int charillegal=0;charillegal<key.getText().length();charillegal++){
						if(key.getText().charAt(charillegal)>57||key.getText().charAt(charillegal)<48){
							remaindArea.setText("请输入正确的关键码！");
							return;
						}
					}
					if(Integer.parseInt(key.getText())<0){
						remaindArea.setText("请输入正确的关键码！");
						return;
					}					
					previewArea.setText(text.tran(preview));
				}
			}
		});
		button_1.setBounds(366, 260, 103, 24);
		contentPane.add(button_1);

		//加密按钮
		JButton lock = new JButton("\u52A0\u5BC6");
		lock.addActionListener(new ActionListener() {
			Englishtomors text=new Englishtomors();
			preTranslate Translate=new preTranslate();
			public void actionPerformed(ActionEvent e) {
				if(inputArea.getText().equals("")){
					remaindArea.setText("未输入代转文段！");
					return;
				}
				outputArea.setText("");
				String english=inputArea.getText();
				
				//中文模块
				english=cfb.gbEncoding(english);
				
				if(Advantageoption.isSelected()==false){
					english=text.tran(english);
				}
				else if(Advantageoption.isSelected()==true){					
					if(key.getText().equals("")){
						remaindArea.setText("未设定关键码！");
						return;
					}
					for(int charillegal=0;charillegal<key.getText().length();charillegal++){
						if(key.getText().charAt(charillegal)>57||key.getText().charAt(charillegal)<48){
							remaindArea.setText("请输入正确的关键码！");
							return;
						}
					}
					if(Integer.parseInt(key.getText())<0){
						remaindArea.setText("请输入正确的关键码！");
						return;
					}
					Translate.build();
					english=Translate.pretranslate(english,Integer.parseInt((key.getText())));
					english=text.tran(english);
				}
				outputArea.setText(english);
				remaindArea.setText("成功转为莫尔斯加密电码，共计"+english.length()+"字符数。");
				english=null;
			}
		});
		lock.setBounds(737, 56, 112, 23);
		contentPane.add(lock);

		//解密按钮
		JButton unlock = new JButton("\u89E3\u5BC6");
		unlock.addActionListener(new ActionListener() {
			Morstoenglish text=new Morstoenglish(); 
			preTranslate Translate=new preTranslate();
			public void actionPerformed(ActionEvent e) {
				if(inputArea.getText().equals("")){
					remaindArea.setText("未输入代转内容！");
					return;
				}
				outputArea.setText("");
				String mors=inputArea.getText();
				if(Advantageoption.isSelected()==false){
					mors=text.tran(mors);
				}
				else if(Advantageoption.isSelected()==true){
					if(key.getText().equals("")){
						remaindArea.setText("未设定关键码！");
						return;
					}
					for(int charillegal=0;charillegal<key.getText().length();charillegal++){
						if(key.getText().charAt(charillegal)>57||key.getText().charAt(charillegal)<48){
							remaindArea.setText("请输入正确的关键码！");
							return;
						}
					}
					if(Integer.parseInt(key.getText())<0){
						remaindArea.setText("请输入正确的关键码！");
						return;
					}
					mors=text.tran(mors);
					Translate.build();
					mors=Translate.retranslate(mors,Integer.parseInt((key.getText())));
				}
				
				//中文模块
				try{
				mors=cfb.decodeUnicode(mors);
				}
				catch(Exception ex){
					remaindArea.setText("关键码错误！");
					return;
				}
				
				outputArea.setText(mors);
				remaindArea.setText("解密成功！共计"+mors.length()+"字符数。");
				mors=null;
			}
		});
		unlock.setBounds(737, 85, 112, 23);
		contentPane.add(unlock);

		//退出按钮
		JButton exit = new JButton("\u9000\u51FA");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(737, 201, 112, 23);
		contentPane.add(exit);

		//文件操作
		JButton inport = new JButton("打开\r\n");
		inport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser Dialog = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("文本文件","txt","doc");
				Dialog.setFileFilter(filter);
				int returnVal = Dialog.showOpenDialog(Dialog);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					try {
						Inport.insert(Dialog.getSelectedFile().getAbsolutePath(),inputArea);
						remaindArea.setText(Dialog.getSelectedFile().getAbsolutePath()+"导入成功！共计"+inputArea.getText().length()+"字符数。");
					} catch (IOException e) {
						remaindArea.setText("未找到文件！");
						return;
					}
				}
			}
		});
		inport.setBounds(737, 27, 112, 23);
		contentPane.add(inport);

		JButton export = new JButton("导出结果至\r\n");
		export.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser Dialog=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("文本文件","txt","doc");
				Dialog.setFileFilter(filter);
				int returnVal = Dialog.showOpenDialog(Dialog);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					try {						
						Export.output(Dialog.getSelectedFile().getAbsolutePath(),outputArea);
						remaindArea.setText("成功导出至"+Dialog.getSelectedFile().getAbsolutePath()+"!");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		export.setBounds(737, 114, 112, 23);
		contentPane.add(export);

		//关键码保存按钮
		JButton button = new JButton("\u4FDD\u5B58\u5173\u952E\u7801\u81F3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser Dialog=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("文本文件","txt","doc");
				Dialog.setFileFilter(filter);
				int returnVal = Dialog.showOpenDialog(Dialog);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					try {						
						Export.output(Dialog.getSelectedFile().getAbsolutePath(),key);
						remaindArea.setText("关键码成功保存至"+Dialog.getSelectedFile().getAbsolutePath()+"!请注意保护该文件！");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		button.setBounds(737, 143, 112, 23);
		contentPane.add(button);

		//清空按钮
		JButton clear = new JButton("清空");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inputArea.setText("");
				outputArea.setText("");
				remaindArea.setText("");
				previewArea.setText("");
				remaindArea.setText("已清空！");
			}
		});
		clear.setBounds(737, 172, 112, 23);
		contentPane.add(clear);

		//标签
		JLabel note1= new JLabel("请输入待转换内容");
		note1.setFont(new Font("黑体", Font.BOLD, 24));
		note1.setForeground(Color.WHITE);
		note1.setBounds(10, 10, 250, 23);
		contentPane.add(note1);

		JLabel note2 = new JLabel("\u9AD8\u7EA7\u9009\u9879");
		note2.setForeground(new Color(255, 0, 0));
		note2.setFont(new Font("黑体", Font.BOLD, 18));
		note2.setBounds(129, 164, 82, 20);
		contentPane.add(note2);

		JLabel note3 = new JLabel("\u8BF7\u8F93\u5165\u5173\u952E\u7801\uFF1A");
		note3.setForeground(new Color(255, 0, 0));
		note3.setFont(new Font("黑体", Font.BOLD, 17));
		note3.setBounds(64, 224, 126, 20);
		contentPane.add(note3);	

		JLabel note4 = new JLabel("加解密结果");
		note4.setFont(new Font("黑体", Font.BOLD, 24));
		note4.setForeground(Color.WHITE);
		note4.setBounds(10, 395, 128, 27);
		contentPane.add(note4);

		JLabel note5 = new JLabel("转码预览");
		note5.setForeground(Color.WHITE);
		note5.setFont(new Font("黑体", Font.BOLD, 24));
		note5.setBounds(10, 256, 112, 24);
		contentPane.add(note5);
        setSize(877,590);  
        setLocation(200, 50);  
        String path = "bg.jpg";  
        ImageIcon background = new ImageIcon(path);  
        JLabel label = new JLabel(background);  
        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));  
        setVisible(true);
	}
}