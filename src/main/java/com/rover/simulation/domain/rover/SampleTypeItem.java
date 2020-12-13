package com.rover.simulation.domain.rover;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

enum SampleType
{
    water_sample,
    rock_sample

}
@Getter
@Setter
@RequiredArgsConstructor
public class SampleTypeItem extends Item<SampleTypeItem> {
}
