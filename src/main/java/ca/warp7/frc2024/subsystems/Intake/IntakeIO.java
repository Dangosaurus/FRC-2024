package ca.warp7.frc2024.subsystems.Intake;

import org.littletonrobotics.junction.AutoLog;

public interface IntakeIO {
    @AutoLog
    public static class IntakeIOInputs {
        public double intakeVelocityRadPerSec = 0.0;
        public double intakeAppliedVolts = 0.0;
        public double intakeCurrentAmps = 0.0;
    }
    /*Updates the set of loggable inputs*/
    public default void updateInputs(IntakeIOInputs inputs) {}
    ;
    /*Set the intake voltage */
    public default void setIntakeVoltage(double volts) {}
    ;
}
