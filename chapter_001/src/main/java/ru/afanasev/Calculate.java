package ru.afanasev;
/**
* Package for calculate task.
*
* @author Afanasev Serei (qwerr75@mail.ru)
* @version $Id$
* @since 0.1
*/
public class Calculate{
	public String echo(String value){
		return String.format("%s %s %s",value, value, value);
	}
	public static void main(String[] args){
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
}