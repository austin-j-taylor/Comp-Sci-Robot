/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.team708.robot.util;

import edu.wpi.first.wpilibj.AnalogGyro;

/**
 * Wrapper class for the gyro allowing interchanging of
 * encoders gyro for measuring rotation.
 * @author 708
 */
public class GyroRotationSensor extends RotationSensor{

    private AnalogGyro gyro;

    public GyroRotationSensor(AnalogGyro gyro){
        this.gyro = gyro;
    }

    public double getAngle(){
        return gyro.getAngle();
    }

    public void reset(){
        gyro.reset();
    }
}
