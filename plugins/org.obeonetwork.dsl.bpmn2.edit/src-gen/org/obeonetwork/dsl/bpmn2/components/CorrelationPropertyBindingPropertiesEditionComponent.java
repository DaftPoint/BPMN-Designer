/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CorrelationProperty;
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.CorrelationPropertyBindingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class CorrelationPropertyBindingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for extensionDefinitions ReferencesTable
	 */
	private ReferencesTableSettings extensionDefinitionsSettings;
	
	/**
	 * Settings for extensionValues ReferencesTable
	 */
	protected ReferencesTableSettings extensionValuesSettings;
	
	/**
	 * Settings for documentation ReferencesTable
	 */
	protected ReferencesTableSettings documentationSettings;
	
	/**
	 * Settings for correlationPropertyRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings correlationPropertyRefSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CorrelationPropertyBindingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject correlationPropertyBinding, String editing_mode) {
		super(editingContext, correlationPropertyBinding, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.CorrelationPropertyBinding.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final CorrelationPropertyBinding correlationPropertyBinding = (CorrelationPropertyBinding)elt;
			final CorrelationPropertyBindingPropertiesEditionPart basePart = (CorrelationPropertyBindingPropertiesEditionPart)editingPart;
			// init values
			if (correlationPropertyBinding.getId() != null && isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, correlationPropertyBinding.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(correlationPropertyBinding, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(correlationPropertyBinding, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(correlationPropertyBinding, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.correlationPropertyRef)) {
				// init part
				correlationPropertyRefSettings = new EObjectFlatComboSettings(correlationPropertyBinding, Bpmn2Package.eINSTANCE.getCorrelationPropertyBinding_CorrelationPropertyRef());
				basePart.initCorrelationPropertyRef(correlationPropertyRefSettings);
				// set the button mode
				basePart.setCorrelationPropertyRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionDefinitions)) {
				basePart.addFilterToExtensionDefinitions(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInExtensionDefinitionsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToExtensionDefinitions(new EObjectFilter(Bpmn2Package.Literals.EXTENSION_DEFINITION));
				// Start of user code for additional businessfilters for extensionDefinitions
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionValues)) {
				basePart.addFilterToExtensionValues(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ExtensionAttributeValue); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for extensionValues
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.documentation)) {
				basePart.addFilterToDocumentation(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Documentation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for documentation
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.correlationPropertyRef)) {
				basePart.addFilterToCorrelationPropertyRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof CorrelationProperty);
					}
					
				});
				// Start of user code for additional businessfilters for correlationPropertyRef
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.correlationPropertyRef) {
			return Bpmn2Package.eINSTANCE.getCorrelationPropertyBinding_CorrelationPropertyRef();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CorrelationPropertyBinding correlationPropertyBinding = (CorrelationPropertyBinding)semanticObject;
		if (Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.id == event.getAffectedEditor()) {
			correlationPropertyBinding.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionDefinitions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ExtensionDefinition) {
					extensionDefinitionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				extensionDefinitionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extensionDefinitionsSettings.move(event.getNewIndex(), (ExtensionDefinition) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionValues == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, extensionValuesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				extensionValuesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extensionValuesSettings.move(event.getNewIndex(), (ExtensionAttributeValue) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.documentation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, documentationSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				documentationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				documentationSettings.move(event.getNewIndex(), (Documentation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.correlationPropertyRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				correlationPropertyRefSettings.setToReference((CorrelationProperty)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CorrelationProperty eObject = Bpmn2Factory.eINSTANCE.createCorrelationProperty();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				correlationPropertyRefSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			CorrelationPropertyBindingPropertiesEditionPart basePart = (CorrelationPropertyBindingPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getCorrelationPropertyBinding_CorrelationPropertyRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.correlationPropertyRef))
				basePart.setCorrelationPropertyRef((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.id || key == Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.correlationPropertyRef;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (Bpmn2ViewsRepository.CorrelationPropertyBinding.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
