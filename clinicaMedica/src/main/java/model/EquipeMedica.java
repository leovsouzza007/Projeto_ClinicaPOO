package model;

import service.Agendavel;
import service.Notificavel;

public class EquipeMedica implements Agendavel, Notificavel {

    private String nomeEquipe;
    private boolean disponivel;

    public EquipeMedica(String nomeEquipe, boolean disponivel) {
        this.nomeEquipe = nomeEquipe;
        this.disponivel = disponivel;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public void agendar() {
        if (verificarDisponibilidade()) {
            System.out.println("Consulta agendada pela equipe: " + nomeEquipe);
            disponivel = false;
        } else {
            System.out.println("Equipe indisponível.");
        }
    }

    @Override
    public void cancelarAgendamento() {
        System.out.println("Agendamento cancelado.");
        disponivel = true;
    }

    @Override
    public boolean verificarDisponibilidade() {
        return disponivel;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println(gerarMensagem());
    }

    @Override
    public String gerarMensagem() {
        return "Sua consulta foi confirmada pela equipe " + nomeEquipe;
    }
}