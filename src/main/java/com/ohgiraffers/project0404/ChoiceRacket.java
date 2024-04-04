package com.ohgiraffers.project0404;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/choice")
public class ChoiceRacket extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {


        String menuRacket = req.getParameter("menuRacket");
        int amount = Integer.parseInt(req.getParameter("amount"));

        System.out.println("menuRacket = " + menuRacket);
        System.out.println("amount = " + amount);

        int orderPrice = 0;
        switch (menuRacket) {
            case "나노플레어555" : orderPrice =190000 * amount; break;
            case "넥스테이지" : orderPrice = 200000 * amount; break;
            case "아크세이버11" : orderPrice = 270000 * amount; break;
            case "아스트록스88" : orderPrice = 290000 * amount; break;
        }
        req.setAttribute("menuRacket",menuRacket);
        req.setAttribute("amount", amount);
        req.setAttribute("orderprice", orderPrice);

        RequestDispatcher rd = req.getRequestDispatcher("/jsp/2_responseracket.jsp");
        rd.forward(req,rep);
    }
}
