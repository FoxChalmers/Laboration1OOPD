package application;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VehicleController implements IVehicleController {

    private static final int X = 800;

    // The model representing the state of the vehicles
    private IVehicleModel model;
    private JPanel controllerInterface;


    // Buttons

    private JPanel controlPanel = new JPanel();

    private JPanel gasPanel = new JPanel();
    private JSpinner gasSpinner = new JSpinner();
    private int gasAmount = 0;
    private JLabel gasLabel = new JLabel("Amount of gas");

    private JButton gasButton = new JButton("Gas");
    private JButton brakeButton = new JButton("Brake");
    private JButton turboOnButton = new JButton("Saab Turbo on");
    private JButton turboOffButton = new JButton("Saab Turbo off");
    private JButton liftBedButton = new JButton("Scania Lift Bed");
    private JButton lowerBedButton = new JButton("Lower Lift Bed");

    private JButton startButton = new JButton("Start all cars");
    private JButton stopButton = new JButton("Stop all cars");

    public VehicleController(IVehicleModel model) {
        this.model = model;
        this.controllerInterface = createControllerInterface();
        initbuttons();
    }

    private void initbuttons() {

        SpinnerModel spinnerModel = new SpinnerNumberModel(0, // initial value
                0, // min
                100, // max
                1);// step
        gasSpinner = new JSpinner(spinnerModel);
        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner) e.getSource()).getValue();
            }
        });

        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);

        controlPanel.setLayout(new GridLayout(2, 4));

        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);
        controlPanel.setPreferredSize(new Dimension((X / 2) + 4, 200));
        controlPanel.setBackground(Color.CYAN);

        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(X / 5 - 15, 200));

        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(X / 5 - 15, 200));

        gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.gas(gasAmount);
            }
        });

        brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.brake(gasAmount);
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.startEngine();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.stopEngine();
            }
        });

        liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.liftPlatform();
            }
        });

        lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.lowerPlatform();
            }
        });

        turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.turboOn();
            }
        });

        turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.turboOff();
            }
        });

    }

    private JPanel createControllerInterface() {

        JPanel controllerInterface = new JPanel();

        // Components to add
        controllerInterface.add(gasPanel);
        controllerInterface.add(controlPanel);
        controllerInterface.add(startButton);
        controllerInterface.add(stopButton);

        return controllerInterface;
    }

    public JPanel getControllerInterface() {
        return controllerInterface;
    }

}
