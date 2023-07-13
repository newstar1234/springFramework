package com.exapmle.ex00.dependency;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Component
@Data
@RequiredArgsConstructor
public class Restaurant {
	private final Chef chef;
}
