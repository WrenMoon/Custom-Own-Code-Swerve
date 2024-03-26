package frc.robot.Subsystems.Swerve;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;

import frc.robot.Constants;

public class SwerveModule extends SubsystemBase {

  final CANSparkMax driveMotor;
  final CANSparkMax turningMotor;
  final CANcoder absoluteEncoder;
  double Offset;

  public SwerveModule(int driveMotorID, int turningMotorID, int absoluteEncoderID, double Offset) {
    this.driveMotor = new CANSparkMax(driveMotorID, MotorType.kBrushless);
    this.turningMotor = new CANSparkMax(turningMotorID, MotorType.kBrushless);
    this.absoluteEncoder = new CANcoder(absoluteEncoderID);
    this.Offset = Offset;

    driveMotor.setIdleMode(Constants.Swerve.driveBrake);
    turningMotor.setIdleMode(Constants.Swerve.turningBrake);
  }

  @Override
  public void periodic() {
  }



}
