package com.thinkitive;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainControllerServlet")
public class MainControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String addedWord = request.getParameter("addedWord");
		String addedMeaning = request.getParameter("addedMeaning");

		HibDbOps db = new HibDbOps();
		db.insertWord(addedWord, addedMeaning);

		request.setAttribute("message", "added word in the dictionary!");
		RequestDispatcher d = request.getRequestDispatcher("dictionary.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchedWord = request.getParameter("searchedWord");

		HibDbOps db = new HibDbOps();
		List ans = db.findWordMeaning(searchedWord);

		request.setAttribute("word", ans.get(0).toString());
		RequestDispatcher d = request.getRequestDispatcher("dictionary.jsp");
		d.forward(request, response);
	}

}
