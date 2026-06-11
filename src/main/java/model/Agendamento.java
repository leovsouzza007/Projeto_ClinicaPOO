package model;
import java.time.LocalDateTime;
public class Agendamento{
 private Paciente paciente; private Medico medico; private LocalDateTime dataHora;
 public Agendamento(Paciente p,Medico m,LocalDateTime d){paciente=p;medico=m;dataHora=d;}
}