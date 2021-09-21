package com.tahaelmi.second.web;

import com.tahaelmi.second.business.service.ReservationService;
import com.tahaelmi.second.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestsWebServiceController {
    private final ReservationService reservationService;

    @Autowired
    public GuestsWebServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Guest> getGuests() {
        return reservationService.getGuests();
    }
}
