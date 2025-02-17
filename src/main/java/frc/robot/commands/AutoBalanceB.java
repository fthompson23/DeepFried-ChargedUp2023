// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.autoBalance;

public class AutoBalanceB extends CommandBase {
  public final autoBalance autoBalanceCommand;

  /** Creates a new AutoBalance. */
  public AutoBalanceB() {
    // Use addRequirements() here to declare subsystem dependencies.
    autoBalanceCommand = new autoBalance();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = autoBalanceCommand.autoBalanceRoutine();
    Robot.m_robotContainer.m_DriveBase.m_drive.arcadeDrive(-speed, 0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Robot.m_robotContainer.m_DriveBase.m_drive.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
