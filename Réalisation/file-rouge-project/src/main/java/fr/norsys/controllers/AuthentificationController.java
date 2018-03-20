package fr.norsys.controllers;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.norsys.entities.AccessType;
import fr.norsys.services.CompteService;
import fr.norsys.services.EmployeService;
import fr.norsys.services.impl.CompteServiceImpl;
import fr.norsys.services.impl.EmployeServiceImpl;

/**
 * Servlet implementation class AuthentificationController
 */
@WebServlet("/authentification")
public class AuthentificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeService employeService = new EmployeServiceImpl();
		CompteService compteService = new CompteServiceImpl();
		employeService.addEmploye("EE507609", "Bouziane", "Marwane", LocalDate.now(),LocalDate.now(), "Adresse 1", "pholocus@gmail.com", "0632653233");
		compteService.addCompte("bouziane", "bouziane", true, AccessType.JOUEUR, "EE507609");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
