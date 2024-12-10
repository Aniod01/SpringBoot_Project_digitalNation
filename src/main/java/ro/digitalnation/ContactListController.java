package ro.digitalnation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ContactListController {
	@Autowired
	private ContactListRepository contactrepo;

	@GetMapping("/")
	public String getContact (Model model) {
		model.addAttribute("contacts", contactrepo.findAll());
		System.out.println("Creating Contact ...");
	    return "index";
	}
	
	@PostMapping("/addContact")
	public String createContact(@ModelAttribute ContactList contact, Model model) {
			contactrepo.save(contact);
			return "redirect:/";
		
	}
	
	@GetMapping("/createContact")
	public String contactForm(Model model) {
		model.addAttribute("contact", new ContactList());
		return "addContact";
	}
	
	@PostMapping("/addContact/{id}")
	public String updateContact(@PathVariable long id, ContactList contact, Model model) {
			contact.setId(id);
			contactrepo.save(contact);
			return "redirect:/";
	
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable long id,Model model) {
		ContactList contact = contactrepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Contact id: " + id + " not found"));
		model.addAttribute("contacts", contact);
		model.addAttribute("contact", new ContactList());
	
		return "updateContact";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteContact(@PathVariable long id, Model model) {
		ContactList contact = contactrepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Contact id: " + id + " not found"));
		contactrepo.delete(contact);
		return "redirect:/";
	}

}
