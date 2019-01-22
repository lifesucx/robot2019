/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
/*
*import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
*import edu.wpi.first.networktables.NetworkTable;
*import edu.wpi.first.networktables.NetworkTableEntry;
*import edu.wpi.first.networktables.NetworkTableInstance;
*/

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//LimeLights --Namo
public class LimeLight{
  NetworkTable table = NetworkTable.getTable("limelight");
  double targetOffSetAngle_Horizontal = table.getNumber("tx", 0);
  double targetOffSetAngle_Vertical = table.getNumber("ty", 0);
  double targetArea = table.getNumber("ta", 0);
  double targetSkew = table.getNumber("ts", 0);
}

public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
