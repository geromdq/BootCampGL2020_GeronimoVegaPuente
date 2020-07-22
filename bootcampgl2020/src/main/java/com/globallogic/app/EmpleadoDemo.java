package com.globallogic.app;

public class EmpleadoDemo {

	public static void main(String[] args) {
		Empleado Employee = new Empleado();
		Employee.setSalario(1000);
		System.out.println(Employee.getNombre() + " tiene un salario promedio de: " + Employee.getSalario());

	}

}
