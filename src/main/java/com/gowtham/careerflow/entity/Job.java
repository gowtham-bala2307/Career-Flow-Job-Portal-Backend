package com.gowtham.careerflow.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String location;

    private LocalDate postedDate;

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private User recruiter;

    public void setRecruiter(User recruiter) {
        this.recruiter = recruiter;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }
    // Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getPostedDate() {
		return postedDate;
	}

	public User getRecruiter() {
		return recruiter;
	}
}
