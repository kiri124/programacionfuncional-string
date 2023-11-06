package b;

import b.Desarrollador;
import b.Iniciativa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class IniciativaFactory {
    ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
    public List<Desarrollador> getAllDesarrolladores(){
        Iniciativa delta = new Iniciativa("Delta Security", "Login", "Luis Carrillo Lopez");
        Iniciativa beta = new Iniciativa("Beta CMR", "Marketing", "Chris Li Carrillo");
        Iniciativa twoFactorAuth = new Iniciativa("Two Factor Authentication", "Autenticación", "Martin Llanos Perez");
        Iniciativa commonUI = new Iniciativa("Canvas Core UI", "User Interfaz", "Robert Downey Li");
        Iniciativa IntiRaymi = new Iniciativa("IntiRaymi Model", "Data Analytics", "Vikram Purush");
        Iniciativa customerOnboarding = new Iniciativa("Digital Onboarding", "Adquisición", "Carla Duarte Rodriguez");
        Iniciativa customerVerification = new Iniciativa("Customer Verification", "Data Analytics", "Pablo Ortiz");
        Iniciativa deepLinks = new Iniciativa("DeepLinks", "Arquitectura", "Ana Torres Castro");
        Iniciativa siteReliability = new Iniciativa("Plataforma", "Admin", "Luis Carrillo Lopez");
        Iniciativa analytics = new Iniciativa("Data Analytics", "Data", "Luis Carrillo Lopez");
        Iniciativa devOps =new Iniciativa("DevOps Deployment", "DevOps", "Paolo Gutierrez");

        desarrolladores.add(new Desarrollador("2020Emp0234", "Bethy", "Alvarez",
                900000, 1, Arrays.asList(delta, beta)));
        desarrolladores.add(new Desarrollador("2012Emp1923", "Ana", "Castillo",
                3500000, 3, Arrays.asList(IntiRaymi, customerOnboarding, beta, siteReliability)));
        desarrolladores.add(new Desarrollador("2017Emp0721", "Pablo", "Castro",
                1800000, 3, Arrays.asList(twoFactorAuth, beta, commonUI)));
        desarrolladores.add(new Desarrollador("2017Emp00031", "Julisa", "Vivanco",
                2200000, 2, Arrays.asList(delta, twoFactorAuth)));
        desarrolladores.add(new Desarrollador("2013Emp0872", "Anabel", "Requena",
                2200000, 3, Arrays.asList(IntiRaymi, delta, deepLinks, analytics)));
        desarrolladores.add(new Desarrollador("2022Emp0087", "Marco", "Serrano",
                900000, 1, List.of(twoFactorAuth)));
        desarrolladores.add(new Desarrollador("2019Emp0050", "Erick", "Taquiri",
                1300000, 1, Arrays.asList(deepLinks, commonUI)));
        desarrolladores.add(new Desarrollador("2023Emp0934", "Ronald", "Baltazar",
                1100000, 1, List.of(IntiRaymi)));
        desarrolladores.add(new Desarrollador("2023Emp1033", "Diego", "Sanchez",
                1200000, 0, List.of(delta)));
        desarrolladores.add(new Desarrollador("2015Emp0009", "Carmen", "Calle",
                2600000, 2, Arrays.asList(customerVerification, deepLinks, devOps)));

        return desarrolladores;
    }
}