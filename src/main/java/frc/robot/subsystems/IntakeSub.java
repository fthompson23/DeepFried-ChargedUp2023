// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSub extends SubsystemBase {
  public CANSparkMax intakeRaise = new CANSparkMax(22, MotorType.kBrushless);
  public CANSparkMax intakeRoll = new CANSparkMax(21, MotorType.kBrushless);

  /** Creates a new IntakeSub. */
  public IntakeSub() {
    intakeRaise.setSmartCurrentLimit(35);
    intakeRoll.setSmartCurrentLimit(35);

    intakeRaise.setIdleMode(IdleMode.kBrake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
