package com.asmide.junlee.ui.editor;

import java.util.ArrayList;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

public class ASMCodeScanner extends RuleBasedScanner{
	private static String[] fgkeywords = {"include","define","start_loop","delay_inner"};
	private static String[] fginstructions = {"loadi","out","move","bne","addi","cpi"};
	
	public ASMCodeScanner(ASMColorProvider colorprovider){
		IToken keyword = new Token(colorprovider.getColor(ASMColorProvider.KEYWORD));
		IToken instruction = new Token(colorprovider.getColor(ASMColorProvider.INSTRUCTION));
		IToken comment = new Token(colorprovider.getColor(ASMColorProvider.SINGLE_LINE_COMMENT));
		IToken string = new Token(colorprovider.getColor(ASMColorProvider.STRING));
		IToken other = new Token(colorprovider.getColor(ASMColorProvider.DEFAULT));
		
		ArrayList<IRule> rules = new ArrayList<IRule>();
		
		rules.add(new EndOfLineRule(";", comment));
		rules.add(new SingleLineRule("\"", "\"", string,'\\'));
		rules.add(new SingleLineRule("'","'",string,'\\'));
		
		rules.add(new WhitespaceRule(new MyWhitespaceDetector()));
		
		WordRule wordRule = new WordRule(new MyWordDecetor(),other);
		for (int i=0;i<fgkeywords.length;i++)
			wordRule.addWord(fgkeywords[1], keyword);
		for (int i=0;i<fginstructions.length;i++)
			wordRule.addWord(fginstructions[i], instruction);
		rules.add(wordRule);
		
		IRule[] result = new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);
		}
}