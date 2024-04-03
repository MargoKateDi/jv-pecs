package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<T> machines = new ArrayList<>();

        if (type.equals(Bulldozer.class)) {
            machines.addAll((List<T>) bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            machines.addAll((List<T>) excavatorProducer.get());
        } else if (type.equals(Truck.class)) {
            machines.addAll((List<T>) truckProducer.get());
        }

        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
